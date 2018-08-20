import models.Cohort;

import static spark.Spark.get;

import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
//
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Controller {

    public static void main(String[] args) {
        VelocityTemplateEngine velocityTemplateEngine = new VelocityTemplateEngine();

        ArrayList<String> students = new ArrayList<String>();
        ArrayList<String> randomStudentName = new ArrayList<String>();
        randomStudentName.add(Cohort.getRandomStudentName());
        ArrayList<String> randomStudentPair = new ArrayList<String>();
        randomStudentPair.add(Cohort.getRandomStudentPair());

        get("/random_name", (req, res) -> {
            Cohort cohort = new Cohort();
            ArrayList<String> name = cohort.getRandomStudentName();
            Map<String, Object> model = new HashMap<>();
            model.put("name", randomStudentName);
            return new ModelAndView(model, "randomName.vtl");
        }, velocityTemplateEngine);

        get("/random_pair", (req, res) -> {
            Cohort cohort = new Cohort();
            ArrayList<String> pair = cohort.getRandomStudentPair();
            Map<String, Object> model = new HashMap<>();
            model.put("name", randomStudentPair);
            return new ModelAndView(model, "randomPair.vtl");
        }, velocityTemplateEngine);
    }
}