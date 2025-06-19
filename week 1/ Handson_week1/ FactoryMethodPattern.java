public class FactoryMethodPatternExample {

    // Document Interface
    interface Document {
        void open();
    }

    // WordDocument
    static class WordDocument implements Document {
        public void open() {
            System.out.println("Opening Word document...");
        }
    }

    // PdfDocument
    static class PdfDocument implements Document {
        public void open() {
            System.out.println("Opening PDF document...");
        }
    }

    // ExcelDocument
    static class ExcelDocument implements Document {
        public void open() {
            System.out.println("Opening Excel document...");
        }
    }

    // Abstract Factory
    static abstract class DocumentFactory {
        public abstract Document createDocument();
    }

    // Word Factory
    static class WordDocumentFactory extends DocumentFactory {
        public Document createDocument() {
            return new WordDocument();
        }
    }

    // PDF Factory
    static class PdfDocumentFactory extends DocumentFactory {
        public Document createDocument() {
            return new PdfDocument();
        }
    }

    // Excel Factory
    static class ExcelDocumentFactory extends DocumentFactory {
        public Document createDocument() {
            return new ExcelDocument();
        }
    }

    // Main method
    public static void main(String[] args) {
        DocumentFactory wordFactory = new WordDocumentFactory();
        Document wordDoc = wordFactory.createDocument();
        wordDoc.open();

        DocumentFactory pdfFactory = new PdfDocumentFactory();
        Document pdfDoc = pdfFactory.createDocument();
        pdfDoc.open();

        DocumentFactory excelFactory = new ExcelDocumentFactory();
        Document excelDoc = excelFactory.createDocument();
        excelDoc.open();
    }
}
