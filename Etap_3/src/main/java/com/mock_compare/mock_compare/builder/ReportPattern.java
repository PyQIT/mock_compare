package com.mock_compare.mock_compare.builder;


public class ReportPattern {

    private String place;
    private String typ;
    private String clientName;
    private String clientSurname;
    private Car car;
   // private Employee employee;
    private CarDealer carDealer;
    private String data;
    private boolean accepted;

    private ReportPattern(ReportBuilder builder)
    {
        this.clientName = builder.clientName;
        this.place =  builder.place;
        this.typ = builder.typ;
        this.clientSurname = builder.clientSurname;
        this.data = builder.data;
      //  this.employee = builder.employee;
        this.carDealer = builder.carDealer;
        this.accepted = false;
    }

    public String getClientName() {
        return clientName;
    }

    public String getPlace(){
        return place;
    }

    public String getTyp(){
        return typ;
    }

    public String getClientSurname() {
        return clientSurname;
    }

    public String getData(){
        return data;
    }


    public boolean getAccepted(){
        return accepted;
    }

    public void setCarDealer(CarDealer carDealer){ this.carDealer = carDealer; }

    public void setCar(Car car) { this.car = car;}

    public void modifyAccepted(boolean accepted)
    {
        this.accepted = accepted;
    }


    public static class ReportBuilder{
        private String place;
        private String typ;
        private String clientName;
        private String clientSurname;
        private Car car;
      //  private Employee employee;
        private CarDealer carDealer;
        private String data;
        private boolean accepted;


        public ReportBuilder setPlace(String place){
            this.place = place;
            return this;
        }

        public ReportBuilder setTyp(String typ){
            this.typ= typ;
            return this;
        }

        public ReportBuilder setClientName(String clientName){
            this.clientName = clientName;
            return this;
        }

        public ReportBuilder setClientSurname(String clientSurname){
            this.clientSurname = clientSurname;
            return this;
        }

        public ReportBuilder setCar(Car car){
              this.car = car;
              return this;
        }

     //   public ReportBuilder setEmployee(Employee employee){
     //       this.employee = employee;
     //       return this;
     //   }

        public ReportBuilder setCarDealer(CarDealer carDealer){
            this.carDealer = carDealer;
            return this;
        }

        public ReportBuilder setData(String data){
            this.data = data;
            return this;
        }

        public ReportPattern build(){
            return new ReportPattern(this);
        }

    }




}
