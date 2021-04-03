package com.dojo.spodfy.resource

import com.dojo.spodfy.model.PesquisaSpotifyApiDto
import com.dojo.spodfy.service.PodcastService
import com.dojo.spodfy.table.Podcast
import com.dojo.spodfy.util.BaseResource
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/podcast")
class PodcastResourc(val podcastService: PodcastService) : BaseResource() {

    @GetMapping
    fun listarTodosPodcast(): List<Podcast> = podcastService.listarTodosPodcast()

    @GetMapping("/usuario/{idUsuario}")
    fun listarTodosPodcastSpotifyPorUsuarioID(@PathVariable idUsuario: Long?): PesquisaSpotifyApiDto? =
        podcastService.listarTodosPodcastSpotifyPorUsuarioID(idUsuario)

}