public class certsteelbar extends Methods
{
    public certsteelbar(mudclient mc){super(mc);}
    private long l;

    public void MainBody(String as[])
    {
	AutoLogin(true);
	  Display("@mag@Draynor Steel Bar Certer -- @gre@Nattawat");
	  Display("@whi@Make sure you have bars in your bag!");
        while(Running())
        {
		WalkToWait (224,633);
        	Wait(10);
        	WalkToWait (227,631);
        	Wait(20);
            while(!QuestMenu() && Running()) 
            {
                l = GetMillis();
                int i[] = GetNpcById(226);
                if(i[0] != -1)
                    TalkToNpc(i[0]);
                while(GetMillis() - l < 5000 && !QuestMenu() && Running()) 
                    Wait(100);
            }
            Answer(1);
            l = GetMillis();
            while(!QuestMenu() && Running() && GetMillis() - l < 10000)
                Wait(100);
            Answer(1);
            l = GetMillis();
            while(!QuestMenu() && Running() && GetMillis() - l < 10000)
                Wait(100);
            Answer(4);
            Wait(3000);
        	WalkToWait (227,631);
        	Wait(10);	
        	WalkToWait (224,633);
        	Wait(20);
            while(!QuestMenu() && Running()) 
            {
                l = GetMillis();
                int i[] = GetNpcById(95);
                if(i[0] != -1)
                    TalkToNpc(i[0]);
                while(GetMillis() - l < 5000 && !QuestMenu() && Running()) 
                    Wait(100);
            }
            Answer(0);
            l = GetMillis();
            while(!InBank() && Running() && GetMillis() - l <= 10000)
                Wait(1000);
	    while(CountInv(529) > 0 && Running() && InBank())
	    {
		Deposit(529,1);
		Wait(500);
	    }
            while(CountInv(171) < 25 && Running() && InBank())
            {
                Withdraw(171,1);
                Wait(200);
            }
            Wait(100);
            CloseBank();
        }
    }

    public void OnChatMessage(String sender, String message)
    {
        if((sender.substring(4).equalsIgnoreCase("mod ") || sender.equalsIgnoreCase("andrew") || sender.equalsIgnoreCase("paul")) && Running())
        {
            Display("A mod was detected!");
            Wait(Rand(2000,5000));
            Speak("Hey " + sender + " back soon, dinner :P");
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