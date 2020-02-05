   package admin;  
      
    import java.io.*;  
    import javax.servlet.http.*;  
    import java.awt.*;  
    import java.awt.image.*;  
    import javax.imageio.*;  
      
    public class Servlet1 extends HttpServlet  
    {  
        @Override
        public void doGet(HttpServletRequest req, HttpServletResponse res){  
        res.setContentType("image/jpeg");
            try  
            {  
                //Create an image 200 x 200  
                BufferedImage bufferedImage = new BufferedImage(200, 200,   
                             BufferedImage.TYPE_INT_RGB);  
      
                //Draw an oval  
                Graphics g = bufferedImage.getGraphics();  
                g.setColor(Color.blue);  
                g.fillOval(0, 0, 199,199);  
      
                //Free graphic resources  
                g.dispose();  
      
                //Write the image as a jpg 
                ImageIO.write(bufferedImage, "jpg", res.getOutputStream());  
            }  
            catch (IOException e)  
            {  
                e.printStackTrace();
            }  
        }  
    } 