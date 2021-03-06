package by.kasyan.rpa.telegram.commands.headmenu;

import by.kasyan.rpa.telegram.commands.BotCommand;
import by.kasyan.rpa.telegram.commands.CommandProcessor;

public class Hello extends CommandProcessor {
    @Override
    public String getResponse() {
        return printInformation();
    }

    public String printInformation() {
        BotCommand[] commands = BotCommand.values();
        StringBuilder description = new StringBuilder();

        for (BotCommand command : commands) {
            description.append(String.format("%n%s - %s", command.getCommand(), command.getDescription()));
        }

        return String.format("Здравствуйте!" +
                "\nЭто мой первый телеграм бот." +
                "\nЗдесь пока только %s команд. " +
                "Попробуйте ввести комманды ниже и посмотрите что произойдет " +
                        "или выбрать комманду внизу экрана: %s",
                commands.length,
                description);
    }
}
