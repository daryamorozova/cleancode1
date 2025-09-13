package theory.practice2.structural.facade.after;

/**
 * Фасад для сложной обработки файла
 */
public class MultimediaFacade {
    private VideoFile videoFile;
    private CodecConverter codecConverter;
    private AudioMixer audioMixer;

    public MultimediaFacade(VideoFile videoFile, CodecConverter codecConverter, AudioMixer audioMixer) {
        this.videoFile = videoFile;
        this.codecConverter = codecConverter;
        this.audioMixer = audioMixer;
    }

    // алгоритм обработки видео
    public void prepareData() {
        videoFile.load();
        codecConverter.convert(videoFile.fileName);
        audioMixer.fixAudio();
    }
}
