package com.zx.jaxrs.service;


import com.zx.jaxrs.model.Commentaire;
import com.zx.jaxrs.model.Response;
//import com.zx.jaxrs.model.Response;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@Path("commentaire")
@Consumes(MediaType.APPLICATION_XML)
@Produces(MediaType.APPLICATION_XML)

public class CommentaireServiceImpl implements CommentaireService {

    private static Map<Integer, Commentaire> listCom = new HashMap<Integer, Commentaire>();
    public CommentaireServiceImpl() {
        Commentaire c=new Commentaire();
        c.setId(23);
        c.setAuteur("zx");
        c.setDateCreation("2019-02-02");
        c.setTitre("qqqqqqqqqqqqq");
        listCom.put(c.getId(),c);
    }

    @Override
    @POST
    @Path("/add")
    public Response addCommentaire(Commentaire c) {

        Response response = new Response();

        if(listCom.get(c.getId()) != null){
            response.setStatus(false);
            response.setMessage("Commentaire Already Exists");
            return response;
        }
        listCom.put(c.getId(), c);
        response.setStatus(true);
        response.setMessage("Commentaire created successfully");
        return response;

    }

    @Override
    @GET
    @Path("/{id}/delete")
    public Response deleteCommentaire(int id) {

        Response response = new Response();
        if(listCom.get(id) == null){
            response.setStatus(false);
            response.setMessage("commentaire Doesn't Exists");
            return response;
        }
        listCom.remove(id);
        response.setStatus(true);
        response.setMessage("commentaire deleted successfully");
        return response;

    }

    @Override
    @GET
    @Path("/{id}/get")
    public Commentaire getCommentaire(int id) {
        return listCom.get(id);
    }

    @Override
    @GET
    @Path("/getAll")
    public Commentaire[] getAllCommentaires() {
        Set<Integer> ids = listCom.keySet();
        Commentaire[] c = new Commentaire[ids.size()];
        int i=0;
        for(Integer id : ids){
            c[i] = listCom.get(id);
            i++;
        }
        return c;
    }
}
