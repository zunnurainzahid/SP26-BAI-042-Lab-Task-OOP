class AIExperimentDemo {

    static void boostExperiment(AIExperiment exp, int bonus) {
        exp.completedEpochs = exp.completedEpochs + bonus;
    }

    public static void main(String[] args) {

        AIExperiment exp1 = new AIExperiment();
        exp1.experimentName = "ImageClassifier-A";
        exp1.completedEpochs = 5;
        exp1.targetEpochs = 20;

        AIExperiment exp2 = new AIExperiment();
        exp2.experimentName = "TextSummarizer-B";
        exp2.completedEpochs = 8;
        exp2.targetEpochs = 15;

        System.out.println("--- Initial state ---");
        System.out.println(exp1.status());
        System.out.println(exp2.status());

        exp1.runEpochs(3);
        exp2.runEpochs(2, 1);

        System.out.println("--- After runEpochs calls ---");
        System.out.println(exp1.status());
        System.out.println(exp2.status());

        exp1.runEpochs(10);
        System.out.println("--- After changing only exp1 further ---");
        System.out.println("exp1 -> " + exp1.status());
        System.out.println("exp2 (unchanged) -> " + exp2.status());

        System.out.println("--- Before boostExperiment(exp2, 4) ---");
        System.out.println(exp2.status());
        boostExperiment(exp2, 4);
        System.out.println("--- After boostExperiment(exp2, 4) ---");
        System.out.println(exp2.status());
    }
}
