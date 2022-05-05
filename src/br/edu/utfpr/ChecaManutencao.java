package br.edu.utfpr;

import java.time.LocalDate;

public class ChecaManutencao {

    public static Boolean checaManutencao(Maquina maquina, int mesesParaManutencao) {
        LocalDate dataManutencaoNecessaria =
                getDataManutencaoNecessaria(maquina, mesesParaManutencao);
        if(dataManutencaoNecessaria.isBefore(LocalDate.now())){
            return true;
        }
        return false;
    }

    private static LocalDate getDataManutencaoNecessaria(Maquina maquina, int mesesParaManutencao) {
        return maquina.getuManutencao().plusMonths(mesesParaManutencao);
    }


}
