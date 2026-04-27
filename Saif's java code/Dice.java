import Player;
import java.awt.Image;
class Dice {
    int diceVal;
    Image img1 ;

    Dice(int diceVal, Image img) {
        this.diceVal = diceVal;
        this.img = img;
    }
    BufferedImage img = null;
        try {
        img1 = ImageIO.read(new File("assets/dice-1.png"));
        img2 = ImageIo.read(new File("assets/dice-2.png"));
        img3 = ImageIo.read(new File("assets/dice-3.png"));
        img4 = ImageIo.read(new File("assets/dice-4.png"));
        img5 = ImageIo.read(new File("assets/dice-5.png"));
        img6 = ImageIo.read(new File("assets/dice-6.png"));
    } catch (IOException e) {
    }

    public Image getImg(int diceVal) {
        switch (diceVal) {
            case 2:
                return img2;
            case 3:
                return img3;
            case 4:
                return im4;
            case 5:
                return im5;
            case 6:
                return img6;
            default:
                return img1;
        }

         public DisplayImage() throws IOException
        {
            BufferedImage img=ImageIO.read(new File("f://images.jpg"));
            ImageIcon icon=new ImageIcon(img);
            JFrame frame=new JFrame();
            frame.setLayout(new FlowLayout());
            frame.setSize(200,300);
            JLabel lbl=new JLabel();
            lbl.setIcon(icon);
            frame.add(lbl);
            frame.setVisible(true);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
    }
}