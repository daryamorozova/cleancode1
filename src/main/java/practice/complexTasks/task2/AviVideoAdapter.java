package practice.complexTasks.task2;

public class AviVideoAdapter implements VideoAdapter {
    @Override
    public void convertToMp4(String inputPath, String outputPath) {
        System.out.println("Converting AVI to MP4: " + inputPath + " -> " + outputPath);
    }
}
