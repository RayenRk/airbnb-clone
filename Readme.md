Fullstack Airbnb Clone Application
==================================

Overview
--------

This project is a fullstack Airbnb clone application developed using modern technologies to deliver a robust and scalable web application. The frontend is built with Angular 17, while the backend leverages Spring Boot 3. PostgreSQL is used as the database, managed within a Docker container. For authentication and authorization, Auth0 is integrated using Okta. PrimeNG is utilized as the UI library for a rich user interface.

Key Features
------------

-   **📅 Booking Management for Travelers:** Users can browse available properties and manage their bookings.
-   **🏠 Landlord Reservation Management:** Property owners can manage reservations and view bookings.
-   **🔍 Search for Houses:** Users can search for houses based on various criteria such as location, date, number of guests, and number of beds.
-   **🔐 Authentication and Authorization:** Secure login and role management handled by Auth0 (OAuth2).
-   **🏢 Domain-Driven Design:** The application follows a domain-driven design approach for better scalability and maintainability.

Usage
-----

### Prerequisites

-   **NodeJS 20.11 LTS**
-   **Angular CLI v17**
-   **IDE:** Visual Studio Code or IntelliJ IDEA

### Fetch Dependencies

To fetch the necessary dependencies, run:

```bash
npm install
```

### Launch Development Server

To launch the development server, execute:

```bash
ng serve
```

Navigate to <http://localhost:4200/>. The application will automatically reload if you change any of the source files.

### Build

To build the project, run:

```bash
ng build
```

The build artifacts will be stored in the `dist/` directory.

Backend Setup
-------------

### Prerequisites

-   **Java 21**
-   **Maven**
-   **Docker**

### Setting Up PostgreSQL with Docker

To set up PostgreSQL using Docker, run the following command:

```bash
docker run --name airbnb-clone -e POSTGRES_PASSWORD=yourpassword -d -p 5432:5432 postgres
```

Ensure you replace `yourpassword` with a secure password.

### Running the Spring Boot Application

To run the Spring Boot application, use the following commands:

```bash
mvn clean install
mvn spring-boot:run
```

The backend server will be available at http://localhost:8080/.

Authentication and Authorization with Auth0
-------------------------------------------

Auth0 is used for managing authentication and authorization. Follow the steps below to configure Auth0:

1.  Create a new Auth0 application from the Auth0 dashboard.
2.  Configure the application with appropriate callback URLs, allowed origins, and other settings.
3.  Update the application configuration files with your Auth0 client ID, domain, and other required settings.

User Interface with PrimeNG
---------------------------

PrimeNG is used to enhance the user interface of the application. It provides a rich set of UI components to create an intuitive and responsive user experience.

Conclusion
----------

This Airbnb clone application demonstrates the integration of a modern web development stack, combining Angular, Spring Boot, PostgreSQL, Docker, and Auth0. It provides comprehensive features for both travelers and landlords, with a strong emphasis on security and usability.