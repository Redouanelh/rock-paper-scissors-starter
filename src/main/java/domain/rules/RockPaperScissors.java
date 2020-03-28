package domain.rules;

import domain.Move;
import domain.Result;
import domain.Rules;

public class RockPaperScissors implements Rules {

    @Override
    public Result decide(Move mine, Move theirs) {

        if (mine == theirs){
            return Result.DRAW;
        }

        switch (mine) {
            case ROCK:
                switch (theirs) { case SCISSORS: return Result.WIN; } break;

            case PAPER:
                switch (theirs) { case ROCK: return Result.WIN; } break;

            case SCISSORS:
                switch (theirs) { case PAPER: return Result.WIN; } break;
        }

        return Result.LOSE;
    }

//    @Override
//    public Result decide(Move mine, Move theirs) {
//        Result result = Result.LOSE;
//
//        if (mine == theirs){
//            return Result.DRAW;
//        }
//
//        switch (mine) {
//            case ROCK:
//                if (theirs == Move.SCISSORS) { result = Result.WIN; break; }
//
//            case PAPER:
//                if (theirs == Move.ROCK) { result = Result.WIN; break; }
//
//            case SCISSORS:
//                if (theirs == Move.PAPER) { result = Result.WIN; break; }
//        }
//        return result;
//    }

}
