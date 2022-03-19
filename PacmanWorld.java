import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class PacmanWorld extends World
{
    private static final int WIDHT_WALL = 28;
    private static final int HEIGHT_WALL = 28;
    
    public PacmanWorld ()
    {
        super(600, 400, 1); 
        prepare();
    }
    
    private void prepare()
    {
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
        Cherry cherry = new Cherry();
        addObject(cherry,407,104);
        cherry.setLocation(396,152);
        removeObject(cherry);
        Banana banana = new Banana();
        addObject(banana,376,81);
        Strawberry strawberry = new Strawberry();
        addObject(strawberry,312,85);
        SmallBall smallBall = new SmallBall();
        addObject(smallBall,273,83);
        SmallBall smallBall2 = new SmallBall();
        addObject(smallBall2,249,81);
        SmallBall smallBall3 = new SmallBall();
        addObject(smallBall3,221,81);
        BigBall bigBall = new BigBall();
        addObject(bigBall,345,80);
        BigBall bigBall2 = new BigBall();
        addObject(bigBall2,196,77);
        Banana banana2 = new Banana();
        addObject(banana2,420,81);
        Cherry cherry2 = new Cherry();
        addObject(cherry2,425,130);
        SmallBall smallBall4 = new SmallBall();
        addObject(smallBall4,423,164);
        BigBall bigBall3 = new BigBall();
        addObject(bigBall3,428,188);
        SmallBall smallBall5 = new SmallBall();
        addObject(smallBall5,425,210);
        SmallBall smallBall6 = new SmallBall();
        addObject(smallBall6,426,223);
        SmallBall smallBall7 = new SmallBall();
        addObject(smallBall7,430,240);
        Banana banana3 = new Banana();
        addObject(banana3,377,243);
        Strawberry strawberry2 = new Strawberry();
        addObject(strawberry2,341,242);
    }
}
