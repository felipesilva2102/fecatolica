package com.mycompany.santo.terco.service;

import jakarta.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.util.*;

@Service
public class NovenaRegistry {

    private final Map<String, Object> novenas = new LinkedHashMap<>();

    @PostConstruct
    public void init() {
        // Escaneia o pacote de novenas e instancia cada classe
        String pkg = "com.mycompany.santo.terco.novena";
        String[] beanNames = {
                "novenaSantoAntaoBean", "novenaSaoFranciscoSalesBean", "novenaSantoTomasAquinoBean",
                "novenaSaoJoaoBoscoBean", "novenaNossaSenhoraCandeiasBean", "novenaPurificacao",
                "novenaNossaSenhoraLourdesBean", "novenaSagradaFaceBean",
                "novenaSaoJoseBean", "novenaNossaSenhoraAnunciacaoBean",
                "novenaAbrSaoJorgeBean", "novenaAbrSaoMarcosBean",
                "novenaMaiNossaSenhoraFatimaBean",
                "novenaJunSagradoCoracaoBean", "novenaJunSantoAntonioBean",
                "novenaJulSantAnaBean",
                "novenaAgoAssuncaoBean",
                "novenaSetNossaSenhoraDoresBean",
                "novenaNossaSenhoraConceicaoBean", "novenaSantaMargaridaMariaAlacoqueBean",
                "novenaSantaTeresaJesusBean", "novenaSantoAntonioSantanaGalvaoBean",
                "novenaSantoInacioAntioquiaBean", "novenaSaoCarloAcutisBean",
                "novenaSaoGeraldoMajellaBean", "novenaSaoJoaoPauloBean",
                "novenaSaoPedroAlcantaraBean", "novenaTodosSantosBean",
                "novenaSantaCatarinaAlexandriaBean", "novenaCristoReiBean",
                "novenaNossaSenhoraGracasBean", "novenaImaculadaConceicaoMariaBean",
                "novenaApresentacaoNossaSenhoraBean",
                "novenaNossaSenhoraGuadalupeBean", "novenaSantaLuziaBean",
                "novenaSaoJoaoCruzBean", "novenaNatalSaoLeaoMagnoBean",
                "novenaSagradaFamiliaBean", "novenaAlmas", "novenaRosasBean"
        };

        String[] classNames = {
                "NovenaSantoAntaoBean", "NovenaSaoFranciscoSalesBean", "NovenaSantoTomasAquinoBean",
                "NovenaSaoJoaoBoscoBean", "NovenaNossaSenhoraCandeiasBean", "NovenaPurificacao",
                "NovenaNossaSenhoraLourdesBean", "NovenaSagradaFaceBean",
                "NovenaSaoJoseBean", "NovenaNossaSenhoraAnunciacaoBean",
                "NovenaAbrSaoJorgeBean", "NovenaAbrSaoMarcosBean",
                "NovenaMaiNossaSenhoraFatimaBean",
                "NovenaJunSagradoCoracaoBean", "NovenaJunSantoAntonioBean",
                "NovenaJulSantAnaBean",
                "NovenaAgoAssuncaoBean",
                "NovenaSetNossaSenhoraDoresBean",
                "NovenaNossaSenhoraConceicaoBean", "NovenaSantaMargaridaMariaAlacoqueBean",
                "NovenaSantaTeresaJesusBean", "NovenaSantoAntonioSantanaGalvaoBean",
                "NovenaSantoInacioAntioquiaBean", "NovenaSaoCarloAcutisBean",
                "NovenaSaoGeraldoMajellaBean", "NovenaSaoJoaoPauloBean",
                "NovenaSaoPedroAlcantaraBean", "NovenaTodosSantosBean",
                "NovenaSantaCatarinaAlexandriaBean", "NovenaCristoReiBean",
                "NovenaNossaSenhoraGracasBean", "NovenaImaculadaConceicaoMariaBean",
                "NovenaApresentacaoNossaSenhoraBean",
                "NovenaNossaSenhoraGuadalupeBean", "NovenaSantaLuziaBean",
                "NovenaSaoJoaoCruzBean", "NovenaNatalSaoLeaoMagnoBean",
                "NovenaSagradaFamiliaBean", "NovenaAlmas", "NovenaRosasBean"
        };

        for (int i = 0; i < beanNames.length; i++) {
            try {
                Class<?> clazz = Class.forName(pkg + "." + classNames[i]);
                novenas.put(beanNames[i], clazz.getDeclaredConstructor().newInstance());
            } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | InstantiationException | NoSuchMethodException | SecurityException | InvocationTargetException e) {
                System.err.println("Falha ao registrar novena: " + classNames[i] + " -> " + e.getMessage());
            }
        }
        System.out.println("NovenaRegistry: " + novenas.size() + " novenas registradas.");
    }

    public Map<String, Object> getNovenaData(String nomeBean) {
        Object bean = novenas.get(nomeBean);
        if (bean == null)
            return null;

        Map<String, Object> data = new LinkedHashMap<>();
        for (Field field : bean.getClass().getDeclaredFields()) {
            if (Modifier.isStatic(field.getModifiers()))
                continue;
            if (Modifier.isTransient(field.getModifiers()) || field.getName().equals("serialVersionUID"))
                continue;
            field.setAccessible(true);
            try {
                Object value = field.get(bean);
                if (value != null) {
                    data.put(field.getName(), value);
                }
            } catch (IllegalAccessException e) {
                // ignore
            }
        }
        return data;
    }

    public Set<String> listarNovenas() {
        return novenas.keySet();
    }

    public boolean existeNovena(String nomeBean) {
        return novenas.containsKey(nomeBean);
    }
}
