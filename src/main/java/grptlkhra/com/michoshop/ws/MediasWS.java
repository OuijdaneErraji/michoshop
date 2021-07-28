package grptlkhra.com.michoshop.ws;

import grptlkhra.com.michoshop.bean.Medias;
import grptlkhra.com.michoshop.service.impl.MediasServiceImplemnt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

@RestController
@RequestMapping("mishoShop/medias")
public class MediasWS {
    @GetMapping("/ref/{ref}")
    public Medias findByRef(@PathVariable String ref) {
        return mediasServiceImplemnt.findByRef(ref);
    }

    @DeleteMapping("/ref/{ref}")
    public int deleteByRef(@PathVariable String ref) {
        return mediasServiceImplemnt.deleteByRef(ref);
    }

    @GetMapping("/")
    public List<Medias> findAll() {
        return mediasServiceImplemnt.findAll();
    }

    @PostMapping("/")
    public int save(@PathVariable Medias medias) {
        return mediasServiceImplemnt.save(medias);
    }

    @PutMapping("/medias/{medias}")
    public int update(@RequestBody Medias medias) {
        return mediasServiceImplemnt.update(medias);
    }

    @Autowired
    MediasServiceImplemnt mediasServiceImplemnt;
}
