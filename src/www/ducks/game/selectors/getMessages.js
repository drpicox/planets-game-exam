import getGame from "./getGame";

export default function getMessages(state) {
  const game = getGame(state);
  return game && game.messages;
}
