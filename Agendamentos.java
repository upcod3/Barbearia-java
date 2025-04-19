class Agendamentos {
    int[] horarios = {10, 11, 12};

// metodo
    void agendar() {
        if(horarios.length > 0){
        System.out.println("Horarios disponiveis:");
        for (int i = 0; i < horarios.length; i++) {
         System.out.println(horarios[i] + ":00");   
            }
        }else{
            System.out.println("Não existe horario disponivel");
        }
    }
}