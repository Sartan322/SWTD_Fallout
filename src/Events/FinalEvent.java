package Events;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class FinalEvent {
    public void history() throws InterruptedException {
        System.out.println("**Ф-ууух, открывает глаза**");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Смутно помню как я дошел, причиной этому всему - сернистые газы с той местности(не зря же мост \"СМЭЭЭЭЭРТИИИИИИИ[ударение на эээ, да, вы не ошиблись]);");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Боже, да так можно совсем потерять рассудок! Чёртова затея...");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("*Простояв еще минут 7-10 в раздумье, оборачиваясь назад, видишь красный клубок*");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Кхм, только он совсем уже не красный. Вчера соляный дождь видимо был, его частично разъело, видимо! Либо плюхнулся в ту лужу, а я ему говорил не лезть!");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("На автомате, уже иду за ним! Да-аа, неизвестно к чему это меня приведёт, тем не менее - пути назад нет.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("!* 1 час в пути.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Я точно знаю... мы найдем...");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("!* 2 час в пути.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("!* .................. {пропускаю как Арсланов, когда пишет матрицу}");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("!* 7 час в пути.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Мы пришли на очень странный карьер. Просто пустошь, \"перекати поле\" так скажем... хех!");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("*Что-то неопознанное стало шевелиться под ногами*");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Ох, это же зыбучие пески! Я читал про это в своей карманной энциклопедии! Кажется, я обречён");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("*Странное ощущение того, что я слишком быстро погрузился и могу дышать и видеть под песком*");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Ах, я же в капсуле! Это жеееее капсула-лифт, стеклянная, шиш!");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("[голос робота Валли]: Сэээээр, добро пожаловать в штаб квартиру БАСКЫЗЫМ!");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("[голос робота Валли]: Наше начальство уже готовится к встрече с Вами.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("[голос робота Валли]: Как только Вы спуститесь, пройдите по коридору направо, потом 14 раз налево и 48 раз направо.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("[голос робота Валли]: Там будет маленький диванчик, так вот - НЕ САДИТЕСЬ НА НЕГО");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("[голос робота Валли]: Просто ждите :) / До скорых встреч!");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Так, проходите говорит! Чую, тут что-то не то!");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("*потеря памяти*");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("*loading 99%*");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("ЫЫЫЫЫ");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Где я?");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Ты на военной базе БАСКАЗЫМ: наши люди лучшие инженеры. Они нашли путь жить свободно, а не в убежищах! Ты прошел все наши испытания и доказал нам, что ты достоин быть");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("членом этой миссии...");
        TimeUnit.SECONDS.sleep(4);
        System.out.println("*перебивая* какая миссия? где все мои друзья, сожители?!");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Ты будешь одним из 228 колонизаторов, которые заселят другую планету и начнут заниматься популяцией и размножением.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Но перед тобой будет стоять выбор:");
        TimeUnit.SECONDS.sleep(2);
    }

    public void react() throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        String finalstring = "Вы сделали свой выбор... / Спасибо за игру! Следите за новостями и обновлениями, будет продолжение!";
        System.out.println("1. Ты с нами - у тебя будет все, что ты захочешь. Но ты не вернешься сюда и твои друзья погибнут, так как нам нужна их плазма - она поможет развитию популяции.");
        System.out.println("2. Ты пытаешься спасти своих друзей - и мы, к сожалению, безжалостно убиваем вас всех. Тебя терять бы не хотелось, но выбор за тобой...");
        System.out.println("Введите номер команды: ");
        String nummberOfCommand = sc.next();
        switch (nummberOfCommand) {
            case "1":
                System.out.println(finalstring);
            case "2":
                System.out.println(finalstring);
        }
    }
}