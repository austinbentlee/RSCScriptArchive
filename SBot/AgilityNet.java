public class AgilityNet extends Script
{
    public AgilityNet(mudclient rs)
    {
        super(rs);
    }
    public String[] getCommands()
    {
        return new String[]{"agilitynet"};
    }
    public void start(String command, String parameter[])
    {
      DisplayMessage("Gnome Agility Net - Flop",3);   
      while (Running())
      {
         AtObject(683,502);
         Wait(100);
         {
            if (Fatigue()>=95&&Running()==true)
            {
               while (Sleeping()==false&&Running()==true)
               {
                  Use(FindInv(1263));
                  Wait(2500);
               }
               while (Sleeping()==true&&Running()==true)
                  Wait(100);
            }
         }
      }
      DisplayMessage("@red@STOPPED", 3);
    }
}