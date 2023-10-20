package org.mpei.HomeWork_7;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    /**
     * - Создать класс Streamer: (String name, double averageMark, int age, int subscribers, List<Platform> platforms,)
     * - Создать класс Platform (String name, boolean isRoscomnadzored)
     *
     *     Сделать три разных платформы и 10-12 стримеров на них.
     *     задачи:
     *     1) Найти всех стримеров старше 21 года и с более 15к подсписчиков на платформе twitch
     *     2) Найти самого молодого стримера на незаболкированной платформе
     *     3) Получить Map<Name(String), PlatformName(String)> для всех стримеров
     *     4) Найти стримера с наименишм количествои подписчиков, который работает на заблокированной платформе
     *     5) Вычислить средний возраст стримеров на платформе twitch
     *     6) Найти любого стримера на youtube с подсчиками > 10k. Если его нет - бросить NoSuchElementException
     *     7) Получить из листа стримеров лист платформ (не должны повторяться платформы в одном листе)
     * */
    public static void main(String[] args) {
        Platform platform1 = new Platform("Youtub", true);
        Platform platform2 = new Platform("Twich", true);
        Platform platform3 = new Platform("PornoHub", false);

        Streamer streamer1 = new Streamer("Serega_Moroz", 5.0, 22, 25000000, List.of(new Platform[]{platform1, platform2}));
        Streamer streamer2 = new Streamer("Kirill_Erema", 0.1, 14, 1, List.of(platform1, platform2));
        Streamer streamer3 = new Streamer("Alex_Kun", 4.89, 25, 4390939, List.of(platform2, platform3));
        Streamer streamer4 = new Streamer("Serbul_Kira", 4.21, 20, 90900282, List.of(platform1, platform2, platform3));
        Streamer streamer5 = new Streamer("Alisa_Solnikova", 3.51, 28, 45987211, List.of(platform3));
        Streamer streamer6 = new Streamer("Matvei_Medved", 4.21, 27, 37269463, List.of(platform1, platform2, platform3));
        Streamer streamer7 = new Streamer("Andrew_Zahaia", 3.0, 43, 27484629, List.of(platform3));
        Streamer streamer8 = new Streamer("Hihiznik_Kirill", 4.56, 20, 565656, List.of(platform2));
        Streamer streamer9 = new Streamer("Max_Gula", 2.21, 10, 345265, List.of(platform1, platform2));
        Streamer streamer10 = new Streamer("Gill_Kirich", 0.99, 35, 43274625, List.of(platform2, platform3));
        Streamer streamer11 = new Streamer("Jasim", 5.01, 23, 1000000000, List.of(platform1));
        Streamer streamer12 = new Streamer("Den_Marchelios", 4.77, 38, 12376436, List.of(platform2));
        Streamer streamer13 = new Streamer("Degtiarev", 2.51, 25, 24587361, List.of(platform3));
        Streamer streamer14 = new Streamer("Marinov", 5.0, 24, 7853241, List.of(platform1, platform2, platform3));
        Streamer streamer15 = new Streamer("Bely_Ludmila", 10.0, 18, 1777777777, List.of());

        List<Streamer> streamers = new ArrayList<>(List.of(streamer1, streamer2, streamer3,
                streamer4, streamer5, streamer6,
                streamer7, streamer8, streamer9,
                streamer10, streamer11, streamer12,
                streamer13, streamer14, streamer15));

        /**
         * 1) Найти всех стримеров старше 21 года и с более 15к подсписчиков на платформе twitch
         * */
        List<Streamer> streamers1 = streamers.stream()
                .filter(s -> s.getAge() > 21 && s.getSubscribers() > 15000000)
                .toList();
        System.out.println("\033[0;32m" + "Список стримеров старше 21 года и с более 15M подписчиков: ");
        System.out.println("\033[0;38m" + streamers1);

        /**
         * 2) Найти самого молодого стримера на незаболкированной платформе
         * */
        List<Streamer> streamers2 = streamers.stream()
                .filter(s -> s.getPlatforms().stream().anyMatch(p -> p.isRoscomnadzored() == true) == true)
                .sorted((o1, o2) -> o1.getAge() < o2.getAge() ? -1 : 1)
                .limit(1)
                .toList();
        System.out.println("\033[0;32m" + "Самый молодой стример на незаблокированной платформе: ");
        System.out.println("\033[0;38m" + streamers2);

        /**
         * 3) Получить Map<Name(String), PlatfromName(String)> для всех стримеров
         * */
        Map<String, List<Platform>> streamers3 = streamers.stream()
                .collect(Collectors.toMap(s -> s.getName(), s -> s.getPlatforms()));
        System.out.println("\033[0;32m" + "Получение Map: ");
        System.out.println("\033[0;38m" + streamers3);

        /**
         * 4) Найти стримера с наименишм количествои подписчиков, который работает на заблокированной платформе
         * */
        List<Streamer> streamers4 = streamers.stream()
                .filter(s -> s.getPlatforms().stream().anyMatch(p -> p.isRoscomnadzored() == false) == true)
                .sorted((o1, o2) -> o1.getSubscribers() < o2.getSubscribers() ? -1 : 1)
                .limit(1)
                .toList();
        System.out.println("\033[0;32m" + "Меньше всего подписчиков на PornoHub: ");
        System.out.println("\033[0;38m" + streamers4);

        /**
         * 4.1) Найти стримера с наибольшим количествои подписчиков, который работает на заблокированной платформе
         * */
        List<Streamer> streamers4_1 = streamers.stream()
                .filter(s -> s.getPlatforms().stream().anyMatch(p -> p.isRoscomnadzored() == false) == true)
                .sorted((o1, o2) -> o1.getSubscribers() < o2.getSubscribers() ? 1 : -1)
                .limit(1)
                .toList();
        System.out.println("\033[0;32m" + "Больше всего подписчиков на PornoHub: ");
        System.out.println("\033[0;38m" + streamers4_1);

        /**
         * 5) Вычислить средний возраст стримеров на платформе twitch
         * */
        double ageAge = streamers.stream()
                .filter(s -> s.getPlatforms().stream().anyMatch(p -> p.getName() == "Twich") == true)
                .mapToDouble(s -> s.getAge())
                .average().getAsDouble();
        System.out.println("\033[0;32m" + "Средний возраст стримеров на платформе twitch: ");
        System.out.println("\033[0;38m" + ageAge);

        /**
         * 6) Найти любого стримера на youtube с подсчиками > 10k. Если его нет - бросить NoSuchElementException
         * */
        Optional<Streamer> streamers5 = Optional.ofNullable(streamers.stream()
                .filter(s -> s.getPlatforms().stream().anyMatch(p -> p.getName() == "Youtub") == true && s.getSubscribers() > 10000000)
                .findAny()
                .orElseThrow(NoSuchElementException::new)); //Exception
        System.out.println("\033[0;32m" + "Любой стример на youtube с подсчиками > 10M: ");
        System.out.println("\033[0;38m" + streamers5);

        /**
         * 7) Получить из листа стримеров лист платформ (не должны повторяться платформы в одном листе)
         * */
        List<Platform> platforms = streamers.stream()
                .map(s -> {
                    return s.getPlatforms();
                })
                .flatMap(List::stream)
                .distinct()
                .toList();
        System.out.println("\033[0;32m" + "Получение листа платформ: ");
        System.out.println("\033[0;38m" + platforms);
    }
}
