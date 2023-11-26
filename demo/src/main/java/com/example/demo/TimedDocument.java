package decorator;

import lombok.AllArgsConstructor;
import lombok.SneakyThrows;

public class TimedDocument implements Document {
    private Document document;

    public TimedDocument(Document document) {
        this.document = document;
    }

    @Override
    @SneakyThrows
    public String parse() {
        long startTime = System.currentTimeMillis();
        String result = document.parse();
        long endTime = System.currentTimeMillis();

        System.out.println(endTime - startTime);
        return result;
    }
}

