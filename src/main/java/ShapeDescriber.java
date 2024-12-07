import java.util.logging.Logger;

public class ShapeDescriber {

    private static final Logger logger = Logger.getLogger(ShapeDescriber.class.getName());

    public void describe(Shape shape) {
        if (shape == null) {
            logger.warning("Provided shape is null.");
            return;
        }

        logger.info("Describing shape...");
        logger.info("Type: " + shape.getClass().getSimpleName());
        logger.info("Color: " + shape.getColorDescription());
        logger.info("Area: " + shape.getArea());
        logger.info("Perimeter: " + shape.getPerimeter());
    }
}