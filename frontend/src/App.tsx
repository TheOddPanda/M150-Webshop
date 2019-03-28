import React, { Component } from 'react';
import './App.css';
import {createMuiTheme, MuiThemeProvider} from "@material-ui/core/styles";
import Main from "./components/Main";

const theme = createMuiTheme({
	palette: {
		primary: {
			main: "#5baa88"
		}
	}
});

class App extends Component {
  render() {
    return (
    	<MuiThemeProvider theme={theme}>
			<Main/>
		</MuiThemeProvider>
    );
  }
}

export default App;
