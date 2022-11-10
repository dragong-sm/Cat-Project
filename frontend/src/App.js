import logo from "./logo.svg";
import "./App.css";
import { Home } from "./pages/Home";
import { About } from "./pages/About";

function App() {
  return (
    <div className="App">
      <Home />
      <About />
      <h1>안녕하세요</h1>
    </div>
  );
}

export default App;
