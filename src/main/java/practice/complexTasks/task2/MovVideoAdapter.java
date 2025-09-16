package practice.complexTasks.task2;

public class MovVideoAdapter implements VideoAdapter {
    @Override
    public void convertToMp4(String inputPath, String outputPath) {
        System.out.println("Converting MOV to MP4: " + inputPath + " -> " + outputPath);
    }
}
