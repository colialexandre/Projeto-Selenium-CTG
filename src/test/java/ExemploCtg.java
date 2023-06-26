import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

public class ExemploCtg {

    @Test
    @DisplayName("Quando pegar o título principal, então devo ver o título viniciuspesson")
    public void verificaHomePage () {

        WebDriver driver = new ChromeDriver();
        String basePage = "https://viniciuspessoni.com/";

        String tituloEsperado = "TESTER GLOBAL";
        String tituloEncontrado = "";

        driver.get(basePage);

        tituloEncontrado = driver.findElement(By.cssSelector("#et-boc > div > div > div.et_pb_section.et_pb_section_0.et_section_regular > div.et_pb_row.et_pb_row_0 > div > div.et_pb_module.et_pb_text.et_pb_text_0.et_pb_text_align_left.et_pb_bg_layout_light > div > h1")).getText();
        System.out.println("tituloEncontrado " +tituloEncontrado);

        assertThat(tituloEncontrado, containsString(tituloEsperado));
        driver.close();


    }
}
