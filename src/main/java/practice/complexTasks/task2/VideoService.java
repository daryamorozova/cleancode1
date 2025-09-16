package practice.complexTasks.task2;

// uploadVideo и streamVideo

import java.util.Map;

public class VideoService {
    private final Map<String, VideoAdapter> adapters;

    public VideoService(Map<String, VideoAdapter> adapters) {
        this.adapters = adapters;
    }

    public Video uploadVideo(String videoPath, String outputPath){
        String format = videoPath.substring(videoPath.lastIndexOf(".") + 1);
        VideoAdapter adapter = adapters.get(format);
        if(adapter == null){
            throw new IllegalArgumentException("unknown format: " + format);
        }
        adapter.convertToMp4(videoPath, outputPath);
        return new Video(outputPath);
    }

    public Stream streamVideo(String videoId){
        return new Stream(videoId);
    }
}
