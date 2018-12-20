import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class StartOfGame {
    public void history() throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        ost = new Audio("C:/Users/Banga/OneDrive/Desktop/FalloutGame/SWTD_Fallout/res/OST.wav",0.6);
        ost.sound();
        ost.setVolume();
        System.out.println("Добро пожаловать в игру Fallout Console Text Game.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Вы выходец из убежища секретного Vault-Tec - Universiade Village №807");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Если вы знакомы с миром Fallout, то введине 1, если нет, то 0.");
        TimeUnit.SECONDS.sleep(2);
        int x = sc.nextInt();
        if(x==0){
            System.out.println("Fallout - культовая компьютерная ролевая серия игр, действие которых происходит в мире, пережившем ядерную войну;");
            TimeUnit.SECONDS.sleep(6);
            System.out.println("Великая война началась и закончилась в субботу, 23 октября, 2077 года, когда ядерное оружие было запущено из всех способных нести его стран мира Fallout (в основном из США, Китая и СССР).");
            TimeUnit.SECONDS.sleep(8);
            System.out.println("Обмен ударами длился около двух часов, по мнению большинства выживших. С последней упавшей атомной бомбой с ядерной боеголовкой мир погрузился в глубокий мрак ядерной катастрофы.");
            TimeUnit.SECONDS.sleep(8);
        }

        System.out.println("Проснувшись в своей родной кровати убижища №807 и выйдя из комнаты, вы обнаруживаете, что все люди куда-то исчезли. ");
        TimeUnit.SECONDS.sleep(4);
        System.out.println("Вы обыскиваете всё убежище, но никого не обнаруживаете. В панике вы бегаете по коридорам и споткнувшись, вы падаете.");
        TimeUnit.SECONDS.sleep(4);
        System.out.println("Поднимаясь вы обнаруживаете перед собой небольшой блок памяти. Вы понимаете, что выпал он из робота помошника.");
        TimeUnit.SECONDS.sleep(4);
        System.out.println("Взяв его, вы бежите в свою комнату и вставляете его в свой Pip-Boy 2000.");
        TimeUnit.SECONDS.sleep(3);
        System.out.println("...Чтение...");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("...Чтение...");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("...Чтение...");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("...Загрузка...");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("...Загрузка...");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("...Загрузка...");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("На мониторе Pip-Boy, вы обнаруживаете, что есть 10 секундный видеофайл.");
        TimeUnit.SECONDS.sleep(5);
        System.out.println("На видео вы видите как некий отряд в необычной экиперовке забирает спящих людей. Повидимому их усыпили, каким-то газом.0");
        TimeUnit.SECONDS.sleep(5);
        System.out.println("Запись прерывается, когда один человек из отряда, что-то кидает в робота помошника. По видимому это ЭМИ граната...");
        TimeUnit.SECONDS.sleep(5);
        System.out.println("Вы не понимаете, как они не забрали и вас.");
        TimeUnit.SECONDS.sleep(3);
        System.out.println("Собравшись с мыслями вы бежите в кабинет смотрителя убежища.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Вы уже не в первый раз входите в терминал смотрителя, без его ведома. Ибо не надо оставлять пароль на сткере монитора.");
        TimeUnit.SECONDS.sleep(5);
        System.out.println("В терминале вы ищите записи с видеокамер.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Ничего нет.");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("Вы ищите хоть какие-то данные, но ничего нет. Видимо эти люди, кто бы они не были, всё удалили.");
        TimeUnit.SECONDS.sleep(5);
        System.out.println("Понимая, что надо искать своих людей, а не просто сидеть на месте, вы отправляетесь на поиски оружия, для выхода на пустошь.");
        TimeUnit.SECONDS.sleep(3);
        System.out.println("Ваше поколение готовили к выходу из убежища и вы готовы к этому.");
        TimeUnit.SECONDS.sleep(3);
        System.out.println("Вы находите 10мм пистолет и 50 патронов к нему. Также вы берёте с собой Боевой нож, 5 стимуляторов, 1 докторский саквояж, 1 антирадин.");
        TimeUnit.SECONDS.sleep(3);
        System.out.println("Подойдя к выхода из убежища, вы произносите Харе Рама, Харе Кришна и запускатее компанду терминали по открытию Двери убежища.");
        TimeUnit.SECONDS.sleep(3);
        System.out.println("Добро пожаловать в жестокий постапокалиптичный мир! War... War never changes...");

    }
    public static Audio ost;
}
