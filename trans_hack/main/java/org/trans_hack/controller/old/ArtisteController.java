package org.trans_hack.controller.old;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.trans_hack.service.old.ArtistService;

import java.util.List;
import java.util.concurrent.ExecutionException;

//@RestController
//@RequestMapping("/api")
public class ArtisteController {
   /* @Autowired
    private ArtistService artistService;
    @PostMapping("/artists")
    public String saveArtist(@RequestBody Artist artist) throws ExecutionException, InterruptedException {
        return artistService.saveArtist(artist);

    }

    @GetMapping("/artists/{firstName}")
    public Artist getArtistDetailsByName(@PathVariable String firstName) throws ExecutionException, InterruptedException {
        return artistService.getArtistDetailsByFirstName(firstName);
    }

    @GetMapping("/artists")
    public List<Artist> getArtistAllDetails() throws ExecutionException, InterruptedException {
        return artistService.getArtistDetails();
    }

    @PutMapping("/artists")
    public String updateArtist(@RequestBody Artist artist) throws ExecutionException, InterruptedException {
        return artistService.updateArtist(artist);

    }

    @DeleteMapping ("/artists/{firsName}")
    public String deleteArtist(@RequestParam String firstName) throws ExecutionException, InterruptedException {
        return artistService.deleteArtist(firstName);

    }

*/

}
