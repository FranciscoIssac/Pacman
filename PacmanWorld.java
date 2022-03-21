import greenfoot.*;
import java.io.*;

public class PacmanWorld extends World
{
    private static final int WIDHT_WALL = 28;
    private static final int HEIGHT_WALL = 28;
    private static final int LIMIT_MAP = 21;
    private static final int OBJECT_SIZE = 28;
    private static final int NEW_LINE = 28;
    
    private int x = OBJECT_SIZE;
    private int y = OBJECT_SIZE;

    public PacmanWorld ()
    {
        super(600, 400, 1); 
        prepare();
    }
    
    private void prepare()
    {

        File doc = new File("C:\\Users\\Francisco\\Desktop\\TOO\\proyectos\\pacman\\Pacman\\PacmanLevel1.txt");

        try
        {
            doc.createNewFile();
            FileReader freader = new FileReader(doc);
            char [] i = new char[LIMIT_MAP*LIMIT_MAP];
            freader.read(i);
            for(char j : i)
            {
                x += OBJECT_SIZE;
                switch(j)
                {
                    case 'X':
                        Wall wall = new Wall();
                        addObject(wall,x,y);
                        break;
                    case 'b':
                        SmallBall smallBall = new SmallBall();
                        addObject(smallBall,x,y);
                        break;
                    case 'B':
                        BigBall bigBall = new BigBall();
                        addObject(bigBall,x,y);
                        break;
                    case 'C':
                        Cherry cherry = new Cherry();
                        addObject(cherry,x,y);
                        break;
                    case 'S':
                        Strawberry strawberry = new Strawberry();
                        addObject(strawberry,x,y);
                        break;
                    case 'P':
                        PacmanHUD hud = new PacmanHUD();
                        addObject(hud,0,0);
                        Pacman pacman = new Pacman(hud);
                        addObject(pacman,x,y);
                        break;
                    default:
                }
                if(x/OBJECT_SIZE == LIMIT_MAP)
                {
                    x = NEW_LINE;
                    y += OBJECT_SIZE;
                }
            }
            freader.close();
        }
        catch (IOException ioe)
        {

        }

        /*
        Wall wall = new Wall();

        for(int x = 50; x < 550; x += WIDHT_WALL)
        {
        wall = new Wall();
        addObject(wall,x,30);
        wall = new Wall();
        addObject(wall,x,350);
        }

        for(int y = 58; y < 200; y += HEIGHT_WALL)
        {
        wall = new Wall();
        addObject(wall,50,y);
        wall = new Wall();
        addObject(wall,526,y);
        }

        PacmanHUD hud = new PacmanHUD();
        addObject(hud,0,0);

        Pacman pacman = new Pacman(hud);
        addObject(pacman,90,70);
         */

    }
}
