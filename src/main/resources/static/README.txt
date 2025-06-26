PDF.js Library Setup Instructions

1. Download the latest pre-built version of PDF.js from: https://mozilla.github.io/pdf.js/getting_started/#download

2. Extract the contents of the downloaded zip file.

3. Copy the 'build' and 'web' folders to this directory (src/main/resources/static/pdfjs/).

Your directory structure should look like:
- src/main/resources/static/pdfjs/build/
- src/main/resources/static/pdfjs/web/

4. Place your sample PDF files in this directory (src/main/resources/static/).
   For example: src/main/resources/static/sample.pdf

Note: The viewer.html template is configured to load a file named 'sample.pdf' from the root of the static directory.
If you use a different filename, update the iframe src attribute in viewer.html accordingly.