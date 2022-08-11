package dietelProject.chapterTen.employeeApp3;


public class CommissionCompensationModel implements CompensationModel {
    private double grossSale;
    private double commissionRate;

    public CommissionCompensationModel(double grossSale, double commissionRate) throws IllegalAccessException {
        this.commissionRate = commissionRate;
        this.grossSale = grossSale;
        if (commissionRate <= 0 || commissionRate >= 0.1){
            throw new IllegalAccessException("commission rate must be between 0.0 and 0.1");
        }
        if(grossSale < 0.0){
            throw new IllegalAccessException("gross rate must be greater than 0");
        }
    }

    public double getGrossSale() {
        return grossSale;
    }

    public void setGrossSale(double grossSale) throws IllegalAccessException {
        this.grossSale = grossSale;
        if(grossSale < 0.0){
            throw new IllegalAccessException("gross rate must be greater than 0");
        }
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) throws IllegalAccessException {
        this.commissionRate = commissionRate;
        if (commissionRate <= 0 || commissionRate >= 0.1){
            throw new IllegalAccessException("commission rate must be between 0.0 and 0.1");
        }
    }
    @Override
    public double earnings(){
        return getCommissionRate() * getGrossSale();
    }

    public static class BasePlusCompensationModel implements CompensationModel {
        private double grossSale;
        private double commissionRate;
        private double baseSalary;

        public BasePlusCompensationModel(double grossSale, double commissionRate, double baseSalary) throws IllegalAccessException {
            this.commissionRate = commissionRate;
            this.grossSale = grossSale;
            this.baseSalary = baseSalary;
            if (commissionRate <= 0 || commissionRate >= 0.1){
                throw new IllegalAccessException("commission rate must be between 0.0 and 0.1");
            }
            if(grossSale < 0.0){
                throw new IllegalAccessException("gross rate must be greater than 0");
            }
            if(baseSalary < 0.0){
                throw new IllegalAccessException("base salary must be greater than 0");
            }
        }

        public double getGrossSale() {
            return grossSale;
        }

        public void setGrossSale(double grossSale) throws IllegalAccessException {
            if(grossSale < 0.0){
                throw new IllegalAccessException("gross rate must be greater than 0");
            }
            this.grossSale = grossSale;
        }

        public double getCommissionRate() {
            return commissionRate;
        }

        public void setCommissionRate(double commissionRate) throws IllegalAccessException {
            if (commissionRate <= 0 || commissionRate >= 0.1){
                throw new IllegalAccessException("commission rate must be between 0.0 and 0.1");
            }
            this.commissionRate = commissionRate;
        }

        public double getBaseSalary() {
            return baseSalary;
        }

        public void setBaseSalary(double baseSalary) throws IllegalAccessException {
            if(baseSalary < 0.0){
                throw new IllegalAccessException("base salary must be greater than 0");
            }
            this.baseSalary = baseSalary;
        }

        @Override
        public double earnings(){
            return getBaseSalary() + getGrossSale() * getCommissionRate();
        }
    }
}
