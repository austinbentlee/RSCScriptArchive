// Decompiled by DJ v3.7.7.81 Copyright 2004 Atanas Neshkov  Date: 15/08/2004 5:13:31 PM
// Home Page : http://members.fortunecity.com/neshkov/dj.html  - Check often for new version!
// Decompiler options: packimports(3) 
// Source File Name:   UberThiever.java

import java.io.PrintStream;

public class UberThieven extends Script
{

    public UberThieven(mudclient mudclient)
    {
        super(mudclient);
        thieved = 0;
    }

    public String[] getCommands()
    {
        return (new String[] {
            "thieveit"
        });
    }

    public void ServerMessage(String s)
    {
        if(s.equals("@gam@You pick the warrior's pocket"))
            thieved++;
        if(s.equals("@whi@You pick the warrior's pocket"))
            thieved++;
    }

    public void start(String s, String as[])
    {
        if(as.length != 1)
        {
            DisplayMessage("@gre@Bruncle: @whi@Invalid number of parameters. /RUN thievewarrior [STYLE]", 3);
        } else
        {
            int i = Integer.parseInt(as[0]);
            DisplayMessage("@red@Warrior Thiever started", 3);
            int j = GetStat(17);
            int k = 0;
            do
            {
                if(!Running())
                    break;
                if(ObjectAt(77, 688) == 64)
                    AtObject(77, 688);
                if(ObjectAt(71, 694) == 64)
                    AtObject(71, 694);
                if(ObjectAt(67, 688) == 64)
                    AtObject(67, 688);
                if(Fatigue() >= 95 && Running())
                {
                    for(; !Sleeping() && Running(); Wait(2500))
                        Use(FindInv(1263));

                    for(; Sleeping() && Running(); Wait(100));
                    if(!Sleeping())
                        k++;
                }
                if(!InCombat())
                {
                    int l = GetNearestNPC(86);
                    ThieveNPC(l);
                    SetFightMode(i);
                    Wait(700);
                }
                for(; InCombat() && Running(); Wait(700))
                {
                    SetFightMode(i);
                    WalkNoWait(GetX(), GetY());
                }

                if(!InCombat())
                    Wait(3000);
            } while(true);
            DisplayMessage("@red@UberThieve STOPPED", 3);
            int i1 = GetStat(17) - j;
            System.out.println("You have thieved " + thieved + " warriors");
            System.out.println("You have gained " + i1 + " thieving levels");
            System.out.println("You have thieved " + thieved * 18 + " gp");
            System.out.println("You have slept " + k + " times");
        }
    }

    public int thieved;
}