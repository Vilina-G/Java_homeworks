package vilina.oop6.ui;

import java.util.ArrayList;
import java.util.List;
import vilina.oop6.ui.commands.AddHuman;
import vilina.oop6.ui.commands.Exit;
import vilina.oop6.ui.commands.FamilyPrint;
import vilina.oop6.ui.commands.HumanSearch;
import vilina.oop6.ui.commands.Load;
import vilina.oop6.ui.commands.Option;
import vilina.oop6.ui.commands.SaveFamily;
import vilina.oop6.ui.commands.Sotr;

public class Menu 
{
    private List<Option> commands;
    private Console console;

    public Menu(Console console) 
    {
        this.console = console;
        commands = new ArrayList<>();
        commands.add(new AddHuman(console));
        commands.add(new FamilyPrint(console));
        commands.add(new HumanSearch(console));
        commands.add(new Sotr(console));
        commands.add(new SaveFamily(console));
        commands.add(new Load(console));
        commands.add(new Exit(console));
    }

    void execute(int num)
    {
        Option option = commands.get(num-1);
        option.execute();
    }

    public String printMenu()
    {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\n\t- =  Меню  = -\n\n");
        for (int i = 0; i < commands.size(); i++) 
        {
            stringBuilder.append(i+1);
            stringBuilder.append(". ");
            stringBuilder.append(commands.get(i).description());
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
    
    public Console getConsole() 
    {
        return console;
    }
}

