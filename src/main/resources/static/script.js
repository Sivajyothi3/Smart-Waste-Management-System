const API_BASE_URL = "http://localhost:8080/api";

async function loadBins() {
  const container = document.getElementById("binsContainer");
  const summary = document.getElementById("summaryData");
  container.innerHTML = "Loading bins...";
  summary.innerText = "Loading summary...";

  try {
    const response = await fetch(`${API_BASE_URL}/bins`);
    const bins = await response.json();
    container.innerHTML = "";

    // 🧮 Initialize counters
    let totalBins = bins.length;
    let emptyBins = 0;
    let fullBins = 0;
    let pickupBins = 0;

    bins.forEach(bin => {
      const fill = bin.fillLevel;
      if (fill < 70) {
        emptyBins++;
      } else {
        fullBins++;
        pickupBins++;
      }

      const status = fill >= 70 ? "Full" : "Empty";
      const statusClass = fill >= 70 ? "status-full" : "status-empty";
      const color = fill >= 70 ? "#e53935" : "#43a047";


      const card = document.createElement("div");
      card.className = "bin-card";
      card.innerHTML = `
        <div class="bin-header">${bin.location}</div>
        <div class="bin-location">${bin.city}, ${bin.district}, ${bin.state}</div>
        <p><b>Fill Level:</b> ${fill}%</p>
        <div class="progress-bar">
          <div class="progress-fill" style="width:${fill}%; background:${color};"></div>
        </div>
        <div class="status ${statusClass}">
          <span></span> ${status}
        </div>
      `;
      container.appendChild(card);
    });

    // 🧾 Update summary text
    summary.innerText = `Total Bins: ${totalBins} | Empty Bins: ${emptyBins} | Full Bins: ${fullBins} | Pickup Bins: ${pickupBins}`;

  } catch (error) {
    console.error("Error loading bins:", error);
    container.innerHTML = "<p style='color:red;'>Failed to load bins.</p>";
    summary.innerText = "Failed to load summary.";
  }
}

document.addEventListener("DOMContentLoaded", loadBins);