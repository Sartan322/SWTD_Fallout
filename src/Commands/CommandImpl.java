package Commands;

public interface CommandImpl {

    String getCommand(); // возвращает команду

    void react(); // тут описываем как нужно регаировать на то или иное событие

}
