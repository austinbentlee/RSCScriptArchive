public class irons extends Methods
{
    public irons(mudclient mc){super(mc);}
 
    public void MainBody(String Args[])
    {
       Display("@cya@Headless Arrows Maker + Iron Arrows Maker -- @gre@Nattawat");
       AutoLogin(true);
       while(Running())
         {
	   if(GetFatigue() > 70 && Running())
            {
                while(!Sleeping() && Running())
                {
                    if(CountInv(1263) < 1)
                    {
            		Display("@red@OMG!!! No sleeping bag!!!!!");
            		Display("@red@Stopping script");
                        End();
                    }
                    UseItem(GetItemPos(1263));
                    Wait(2500);
                }
                while(Sleeping() && Running())
                    Wait(100);
	    }
	while(GetFatigue() < 75 && CountInv(280) > 9 && CountInv(381) > 9)
	   {
  	    UseItemWithItem(GetItemPos(280),GetItemPos(381));
	    Wait(1000);
           }
	while(GetFatigue() < 75 && CountInv(637) > 9 && CountInv(670) > 9)
	   {
  	    UseItemWithItem(GetItemPos(637),GetItemPos(670));
	    Wait(1000);
           }
        while(CountInv(637) <= 9) {End();}
	}
    }
public void OnChatMessage(String sender, String message)
    {
        if((sender.substring(4).equalsIgnoreCase("mod ") || sender.equalsIgnoreCase("andrew") || sender.equalsIgnoreCase("paul")) && Running())
        {
            Display("A mod was detected!");
            Wait(Rand(2000,5000));
            Speak("Hey " + sender + ", gotta go see ya later!");
            Wait(Rand(2000,5000));
            LogOut();
            End();
        }
    }

    public void OnPrivateMessage(String sender, String message)
    {
        if((sender.substring(4).equalsIgnoreCase("mod ") || sender.equalsIgnoreCase("andrew") || sender.equalsIgnoreCase("paul")) && Running())
        {
            Display("A mod was detected!");
            LogOut();
            End();
        }
    }

    public void OnServerMessage(String message)
    {
    }
}