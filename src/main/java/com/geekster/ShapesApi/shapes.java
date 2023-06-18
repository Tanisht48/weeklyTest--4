package com.geekster.ShapesApi;

import com.geekster.ShapesApi.MyObjects.Circle;
import com.geekster.ShapesApi.MyObjects.Rectangle;
import com.geekster.ShapesApi.MyObjects.Triangle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class shapes {

        @Bean("circle")
        public Circle getCircleObject(){
        return new Circle(7);
        }
        @Bean("rectangle")
        public Rectangle getRectangleObject(){
        return new Rectangle(12,20);
        }
        @Bean("triangle")
        public Triangle getTriangleObject(){
        return new Triangle(14,20);
        }
}
