import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { SignupComponent } from './auth/signup/signup.component';
import { SigninComponent } from './auth/signin/signin.component';
import { GameListComponent } from './game-list/game-list.component';
import { SingleGameComponent } from './game-list/single-game/single-game.component';
import { HeaderComponent } from './header/header.component';
import { AuthService } from './services/auth.service';
import { GamesService } from './services/games.service';
import { AuthGuardService } from './services/auth-guard.service';
import { Routes, RouterModule } from '@angular/router';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';

const appRoutes: Routes = [
  { path: 'auth/signup', component: SignupComponent },
  { path: 'auth/signin', component: SigninComponent },
  { path: 'games', component: GameListComponent },
  { path: 'games/view/:id', component: SingleGameComponent }
]

@NgModule({
  declarations: [
    AppComponent,
    SignupComponent,
    SigninComponent,
    GameListComponent,
    SingleGameComponent,
    HeaderComponent,
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    FormsModule,
    ReactiveFormsModule,
    AppRoutingModule,
    RouterModule.forRoot(appRoutes)
  ],
  providers: [
    AuthService,
    GamesService,
    AuthGuardService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
