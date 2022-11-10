import React, { useEffect } from "react";
import "./App.css";
import { Home } from "./pages/Home";
import { About } from "./pages/About";
import { useState } from "react";
import { Route, Routes } from "react-router-dom";
import { getData, axiosData } from "./api/getCats";
import data from "./db/mock.json";

function App() {
  // 데이터는 db로 불러오기 !
  const [cats, setCats] = useState([]);
  useEffect(() => {
    // axios 사용
    const data = axiosData();
    data.then((data) => setCats(data));
  }, []);

  return (
    <div className="App">
      <Routes>
        <Route path="/" element={<Home />} />
          <Route path="/about" element={<About cats={cats} />} />
      </Routes>
      {/* <Home /> */}
      {/* <About cats={cats} />  */}
    </div>
  );
}

export default App;
