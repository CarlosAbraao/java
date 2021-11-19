package com.devcarlos.springboot.carteira.service;

import com.devcarlos.springboot.carteira.model.Usuario;

public interface UsuarioService {

	Usuario autenticar(String email, String senha);
	Usuario cadastrarUsuario(Usuario usuario);
	void validadeEmail(String email);
}
