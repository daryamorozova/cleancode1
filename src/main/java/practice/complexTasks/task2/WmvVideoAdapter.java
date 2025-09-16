package practice.complexTasks.task2;

public class WmvVideoAdapter implements VideoAdapter {
    @Override
    public void convertToMp4(String inputPath, String outputPath) {
        System.out.println("Converting WMV to MP4: " + inputPath + " -> " + outputPath);
    }
}
