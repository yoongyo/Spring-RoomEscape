package bizchoollab.roomEscape.controller;

import bizchoollab.roomEscape.entity.Theme;
import bizchoollab.roomEscape.service.ThemeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ThemeController {

    private final ThemeService themeService;

    @GetMapping("/{roomescape_name}/themes")
    public List<Theme> themes(@PathVariable String roomescape_name) {
        return themeService.themes(roomescape_name);
    }
}
