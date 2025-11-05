# 🌿 Smart Waste Management & Recycling System

A full-stack web application designed to make urban waste collection smarter and more efficient.  
This system monitors bin fill levels, schedules waste pickups automatically, allows citizens to report waste, and collects feedback — contributing to a cleaner and greener environment.  

---

## 🌟 About the Project

The **Smart Waste Management System** helps cities manage garbage collection more effectively by using real-time bin data.  
Citizens can report waste or submit feedback, while authorities can track bin fill levels and optimize pickup routes.

This project is ideal for showcasing skills in **Java Spring Boot**, **MySQL**, and **Frontend Web Development**, making it an excellent addition to a software development portfolio.

---

## 🧩 Features Overview

### 🏠 Home Page
- Overview of the system and navigation links.
- Shows total bins, full bins, empty bins, and pickup bins summary.

<img width="1920" height="1080" alt="Screenshot 2025-11-05 092437" src="https://github.com/user-attachments/assets/6a1f496f-bc05-4942-b7cc-b617351afea7" />

---

### 🗑️ Bins Page
- Displays all smart waste bins with real-time fill levels and status (Empty / Full).
- Progress bars show how filled each bin is.
- Summarizes total, full, empty, and pickup bins.
 
<img width="1920" height="1080" alt="Screenshot 2025-11-05 092453" src="https://github.com/user-attachments/assets/b66eb563-f055-40ba-823c-f2e078100ea9" />

---

### 📍 Report Waste Page
- Allows citizens to report uncollected or overflowing waste.
- Fields include **Location**, **Description**, and **Status (Full / Available)**.
- Data is stored in the backend and viewable in the admin panel.
  
<img width="1920" height="1080" alt="Screenshot 2025-11-05 092549" src="https://github.com/user-attachments/assets/02cd1036-8d07-4883-8be9-75379bf26e70" />


---

### 🧹 Pickups Page
- Lists bins that need pickup based on fill-level data.
- Helps the waste collection team plan optimized pickup routes.

<img width="1920" height="1080" alt="Screenshot 2025-11-05 092521" src="https://github.com/user-attachments/assets/61442468-ac35-4687-8abc-765add0a7e2d" />

---

### 💬 Feedback Page
- Users can provide feedback about cleanliness or system performance.
- Simple form with **Name**, **Email**, and **Message**.
- Helps improve community engagement.
  
<img width="1920" height="1080" alt="Screenshot 2025-11-05 092549" src="https://github.com/user-attachments/assets/7c4a6e84-c0d7-4557-89af-a521217a098b" />

---

## ⚙️ Tech Stack

**Frontend:**
- HTML, CSS, JavaScript (Vanilla)

**Backend:**
- Java Spring Boot
- JDBC / JPA / Hibernate

**Database:**
- MySQL

**Tools:**
- Maven
- Git & GitHub

---

## 🧠 System Modules

| Module | Description |
|--------|--------------|
| Bin Management | Tracks each bin’s fill level and status |
| Pickup Scheduling | Automatically marks bins for pickup when full |
| Waste Reporting | Citizens report issues via frontend form |
| Feedback System | Collects user feedback and suggestions |

---

## 🖥️ How to Run Locally

1. Clone the repository:
   ```bash
   git clone https://github.com/Sivajyothi3/Smart-Waste-Management-System.git
2. Open the project in VS Code or IntelliJ IDEA.

3. Configure your database:

  Create a MySQL database:
  
  CREATE DATABASE smartwaste_dev;
  Update credentials in src/main/resources/application.properties.

4. Build and run:

  ./mvnw spring-boot:run
  Open in your browser:
  👉 http://localhost:8080

🔐 Security Note
The file application-example.properties is provided as a safe template (no real credentials).

Your actual credentials should remain only in application.properties on your local machine.

---

💡 Future Enhancements

Add live GPS tracking for garbage trucks.

Implement user authentication for citizen & admin dashboards.

Deploy on cloud (Render / Railway) with environment variables.

---

👩‍💻 Author

Varikunta Siva Jyothi
💻 B.Tech Student | Aspiring Full Stack Developer
🌟 GitHub: Sivajyothi3 
📧 Email: varikuntasj@gmail.com
---

⭐ If you like this project, give it a star on GitHub!


