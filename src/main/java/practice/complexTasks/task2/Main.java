package practice.complexTasks.task2;

import java.util.HashMap;
import java.util.Map;

/**
 * Разработка библиотеки для стримингового сервиса видео
 * Цель: Создать библиотеку, которая обеспечивает функции загрузки и просмотра видео в форматах: AVI, MOV, WMV.
 * Система должна поддерживать загрузку видео в различных форматах и конвертировать их в единый внутренний формат MP4 для упрощения стриминга.
 * <p>
 * Паттерны проектирования:
 * Adapter: Для преобразования загружаемых видео форматов (AVI, MOV, WMV) в внутренний формат MP4.
 * Facade: Для предоставления упрощенного интерфейса к сложным операциям обработки видео, включая загрузку, конвертацию и стриминг.
 * <p>
 * Архитектура библиотеки:
 * VideoService: Класс, использующий паттерн Facade, предоставляет методы uploadVideo и streamVideo, упрощая клиентский доступ к функционалу сервиса.
 * VideoAdapter: Интерфейс и его реализации для каждого поддерживаемого формата видео, преобразующие видео в формат MP4.
 * <p>
 * // Инициализация сервиса с адаптерами для поддерживаемых форматов
 * VideoService videoService = new VideoService(new AviVideoAdapter(),
 * new MovVideoAdapter(), new WmvVideoAdapter());
 * <p>
 * // Загрузка видео файла в формате AVI
 * String videoPath = "path/to/example.avi";
 * Video video = videoService.uploadVideo(videoPath);
 * <p>
 * // Стриминг видео в формате MP4
 * Stream stream = videoService.streamVideo(video.getId());
 * <p>
 * // Вывод информации о стриме
 * System.out.println("Streaming video in MP4 format, Video ID: " +
 * video.getId());
 */

public class Main {
    public static void main(String[] args) {
        Map<String, VideoAdapter> adapters = new HashMap<>();
        adapters.put("avi", new AviVideoAdapter());
        adapters.put("mov", new MovVideoAdapter());
        adapters.put("wmv", new WmvVideoAdapter());

        VideoService videoService = new VideoService(adapters);

        // Загрузка видео файла в формате AVI
        String videoPath = "path/to/example.mov";
        String outputPath = "path/to/example.mp4";
        Video video = videoService.uploadVideo(videoPath, outputPath);

        // Стриминг видео в формате MP4
        Stream stream = videoService.streamVideo(video.getId());

        // Вывод информации о стриме
        System.out.println("Streaming video in MP4 format, Video ID: " + video.getId());
    }
}