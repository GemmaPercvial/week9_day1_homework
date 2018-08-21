import models.Cohort;

import static spark.Spark.get;

import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

import java.util.HashMap;


public class Controller {

    public static void main(String[] args) {
        VelocityTemplateEngine velocityTemplateEngine = new VelocityTemplateEngine();

        Cohort cohort = new Cohort();

        get("/random_name", (req, res) -> {
            HashMap<String, Object> model = new HashMap<>();
            model.put("randomStudentName", cohort.shuffleStudents());
            model.put("template", "randomName.vtl");
            return new ModelAndView(model, "randomName.vtl");
        }, velocityTemplateEngine);

        get("/random_pair", (req, res) -> {
            HashMap<String, Object> model = new HashMap<>();
            model.put("randomStudentPair", cohort.shuffleStudentPairs());
            model.put("template", "randomPair.vtl");
            return new ModelAndView(model, "randomPair.vtl");
        }, velocityTemplateEngine);
    }
}