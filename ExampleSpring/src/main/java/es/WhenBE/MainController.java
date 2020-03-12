package es.WhenBE;

import es.WhenBE.request.*;
import es.WhenBE.dto.*;
import es.WhenBE.repository.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.Optional;
import java.util.stream.Collectors;

@Controller // This means that this class is a Controller
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
@RequestMapping(path="/demo") // This means URL's start with /demo (after Application path)
public class MainController {
    @Autowired // This means to get the bean called userRepository
    private ExamenRepository examenRepository; // Which is auto-generated by Spring, we will use it to handle the data

    @Autowired
    private AsignaturaRepository asignaturaRepository;

    @Autowired
    private TareaRepository tareaRepository;

    private Logger log = LoggerFactory.getLogger(MainController.class);

    @PostMapping(path="/add-tarea") // Map ONLY POST Requests
    public @ResponseBody String addNewtarea (@RequestBody TareaRequest tareaRequest) {
        // @ResponseBody means the returned String is the response, not a view name
        // @RequestParam means it is a parameter from the GET or POST request

        Optional<Asignatura> asignatura = asignaturaRepository.findById(1);
        Tarea tarea = tareaRequest.toEntity();
        tarea.setAsignatura(asignatura.get());
        tareaRepository.save(tarea);
        return "Saved";
    }

    @GetMapping(path="/all-tarea")
    public ResponseEntity<Collection<TareaDto>> getAllTareas() {
        // This returns a JSON or XML with the users
        return ResponseEntity.status(HttpStatus.OK).body(tareaRepository.findAll()
                .stream()
                .map(TareaDto::new)
                .collect(Collectors.toList()));
    }

    @PostMapping(path="/add-asignatura") // Map ONLY POST Requests
    public @ResponseBody String addNewAsig (@RequestBody AsignaturaRequest asignaturaRequest) {
        // @ResponseBody means the returned String is the response, not a view name
        // @RequestParam means it is a parameter from the GET or POST request

        Asignatura asignatura = asignaturaRequest.toEntity();
        asignaturaRepository.save(asignatura);
        return "Saved";
    }

    @GetMapping(path="/all-asignatura")
    public ResponseEntity<Collection<AsignaturaDto>> getAllAsig() {
        // This returns a JSON or XML with the users
        return ResponseEntity.status(HttpStatus.OK).body(
                asignaturaRepository.findAll()
                .stream()
                .map(AsignaturaDto::new)
                .collect(Collectors.toList()));
    }

    @PostMapping(path="/add-examen") // Map ONLY POST Requests
    public @ResponseBody String addNewExam (@RequestBody ExamenRequest examenRequest) {
        // @ResponseBody means the returned String is the response, not a view name
        // @RequestParam means it is a parameter from the GET or POST request

        Optional<Asignatura> asignatura = asignaturaRepository.findById(1);
        Examen examen = examenRequest.toEntity();
        examen.setAsignatura(asignatura.get());
        examenRepository.save(examen);
        return "Saved";
    }

    @GetMapping(path="/all-examen")
    public ResponseEntity<Collection<ExamenDto>> getAllExam() {
        // This returns a JSON or XML with the users
        return ResponseEntity.status(HttpStatus.OK).body(examenRepository.findAll()
                .stream()
                .map(ExamenDto::new)
                .collect(Collectors.toList()));
    }
}