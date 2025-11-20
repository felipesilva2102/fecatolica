package com.mycompany.santo.terco.util;

import com.mycompany.santo.terco.liturgia.LiturgiaBean;
import jakarta.enterprise.context.SessionScoped;
import jakarta.faces.context.FacesContext;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import java.io.Serializable;
import java.lang.reflect.Field;
import lombok.Getter;
import lombok.Setter;

@Named
@SessionScoped
@Getter
@Setter
public class BeanUtil implements Serializable {

    private String nomeBean;

    @Inject
    private LiturgiaBean liturgiaBean;

    public String resetTerco() {
        this.nomeBean = null;
        return "/santo_terco.xhtml?faces-redirect=true";
    }

    public String resetRosario() {
        this.nomeBean = null;
        return "/santo_rosario.xhtml?faces-redirect=true";
    }

    public String resetLiturgia() {
        this.nomeBean = null;
        if (getLiturgiaBean().getLiturgia().getData() == null) {
            liturgiaBean.carregarLiturgia();
        }
        return "/liturgia.xhtml?faces-redirect=true";
    }

    public String resetQuaresma(String quaresma) {
        this.nomeBean = null;
        if (quaresma.equals("miguel")) {
            return "/quaresmas/quaresma-sao-miguel.xhtml?faces-redirect=true";
        } else if (quaresma.equals("jose")) {
            return "/quaresmas/quaresma-sao-jose.xhtml?faces-redirect=true";
        }
        return null;
    }

    /**
     * Obtém dinamicamente o bean atual pelo nome armazenado.
     *
     * @return
     */
    public Object getBeanAtual() {
        if (nomeBean == null || nomeBean.isEmpty()) {
            return null;
        }

        FacesContext ctx = FacesContext.getCurrentInstance();
        return ctx.getApplication().evaluateExpressionGet(ctx, "#{" + nomeBean + "}", Object.class);
    }

    /**
     * Altera o bean ativo e redireciona para a página de novena.
     *
     * @param novoBean
     * @return
     */
    public String mudarPara(String novoBean) {
        this.nomeBean = novoBean;
        return "/novena.xhtml?faces-redirect=true";
    }

    /**
     * Verifica se o bean atual possui determinado campo.
     *
     * @param nomeCampo
     * @return
     */
    public boolean temCampo(String nomeCampo) {
        Object bean = getBeanAtual();
        if (bean == null) {
            return false;
        }

        try {
            Field field = bean.getClass().getDeclaredField(nomeCampo);
            return field != null;
        } catch (NoSuchFieldException e) {
            return false;
        }
    }

    /**
     * Retorna o valor de um campo específico do bean atual.
     *
     * @param nomeCampo
     * @return
     */
    public Object getValorCampo(String nomeCampo) {
        Object bean = getBeanAtual();
        if (bean == null) {
            return null;
        }

        try {
            Field field = bean.getClass().getDeclaredField(nomeCampo);
            field.setAccessible(true);
            return field.get(bean);
        } catch (IllegalAccessException | NoSuchFieldException e) {
            return null;
        }
    }
}
