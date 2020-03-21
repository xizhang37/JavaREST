package com.zx.jaxrs.service;


import com.zx.jaxrs.model.Commentaire;
import com.zx.jaxrs.model.Response;

public interface CommentaireService {

    public Response addCommentaire(Commentaire c);

    public Response deleteCommentaire(int id);

    public Commentaire getCommentaire(int id);

    public Commentaire[] getAllCommentaires();


}
