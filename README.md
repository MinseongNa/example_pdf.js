# example_pdf.js
Example of [PDF.js](https://mozilla.github.io/pdf.js/) integration in Spring Boot with Gradle

## Project Overview
This project demonstrates how to integrate Mozilla's PDF.js library with a Spring Boot application to view PDF files in the browser.

## Technologies Used
- Spring Boot 2.7.5
- Gradle 7.x
- Thymeleaf (for HTML templates)
- PDF.js (Mozilla's JavaScript library for displaying PDFs)

## Project Structure
```
example_pdf.js/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── example/
│   │   │           └── pdfjs/
│   │   │               ├── controller/
│   │   │               │   └── PdfController.java
│   │   │               └── PdfJsApplication.java
│   │   └── resources/
│   │       ├── static/
│   │       │   └── pdfjs/  (PDF.js library files go here)
│   │       ├── templates/
│   │       │   ├── index.html
│   │       │   ├── viewer_mjs.html
│   │       │   └── viewer_js.html
│   │       └── application.properties
│   └── test/
│       └── java/
│           └── com/
│               └── example/
│                   └── pdfjs/
├── build.gradle
├── settings.gradle
└── README.md
```

## Setup Instructions

### 1. Clone the repository
```bash
git clone https://github.com/MinseongNa/example_pdf.js.git
cd example_pdf.js
```

### 2. Set up PDF.js
Follow the instructions in `src/main/resources/static/README.txt` to download and set up the PDF.js library.

### 3. Build and run the application
```bash
# On Windows
gradlew.bat bootRun

# On Linux/Mac
./gradlew bootRun
```

### 4. Access the application
Open your browser and navigate to:
- http://localhost:8080 - Home page
- http://localhost:8080/viewer - PDF viewer page

## Building the Project
```bash
# On Windows
gradlew.bat build

# On Linux/Mac
./gradlew build
```

## Running Tests
```bash
# On Windows
gradlew.bat test

# On Linux/Mac
./gradlew test
```

