package com.tresor.application.manager.input;

import com.tresor.application.domain.aventurier.Aventurier;

public interface InputManager {

	

	Input getInput(Aventurier aventurier);

	boolean isFinished(Aventurier c);


}
