package xyz.felipearaujo.flexibletimemanager.entities;

public class RuleTimeOfDay implements Rule {
    // TODO: melhorar representacao de hora do dia.
    int afterHour;
    int afterMinute;
    int beforeHour;
    int beforeMinute;

    @Override
    public void obey() {

    }
}
